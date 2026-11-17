-- Script de inicialización de datos de prueba para la API de órdenes
-- Este script se ejecuta al iniciar la aplicación si spring.sql.init.mode está configurado

-- Tabla de órdenes
CREATE TABLE IF NOT EXISTS orders (
    id VARCHAR(255) PRIMARY KEY,
    status VARCHAR(50) NOT NULL,
    customer_id VARCHAR(255) NOT NULL,
    created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

-- Tabla de items de orden
CREATE TABLE IF NOT EXISTS order_items (
    id SERIAL PRIMARY KEY,
    order_id VARCHAR(255) NOT NULL REFERENCES orders(id),
    product_id VARCHAR(255) NOT NULL,
    quantity INTEGER NOT NULL CHECK (quantity > 0),
    price DECIMAL(10, 2) NOT NULL CHECK (price >= 0)
);

-- Datos de prueba: órdenes con diferentes estados
INSERT INTO orders (id, status, customer_id, created_at) VALUES
    ('ord-001', 'PENDING', 'cust-001', '2025-01-15 10:30:00'),
    ('ord-002', 'CONFIRMED', 'cust-002', '2025-01-15 11:45:00'),
    ('ord-003', 'PROCESSING', 'cust-001', '2025-01-15 14:20:00'),
    ('ord-004', 'SHIPPED', 'cust-003', '2025-01-14 09:15:00'),
    ('ord-005', 'DELIVERED', 'cust-004', '2025-01-13 16:00:00'),
    ('ord-006', 'CANCELLED', 'cust-002', '2025-01-14 08:30:00'),
    ('ord-007', 'PENDING', 'cust-005', '2025-01-16 08:00:00'),
    ('ord-008', 'CONFIRMED', 'cust-006', '2025-01-16 09:30:00'),
    ('ord-009', 'DELIVERED', 'cust-007', '2025-01-12 12:00:00'),
    ('ord-010', 'PENDING', 'cust-001', '2025-01-16 10:00:00')
ON CONFLICT (id) DO NOTHING;

-- Datos de prueba: items para cada orden
INSERT INTO order_items (order_id, product_id, quantity, price) VALUES
    -- Items para ord-001 (PENDING)
    ('ord-001', 'prod-101', 2, 29.99),
    ('ord-001', 'prod-102', 1, 49.99),
    
    -- Items para ord-002 (CONFIRMED)
    ('ord-002', 'prod-201', 3, 15.50),
    ('ord-002', 'prod-202', 1, 89.99),
    
    -- Items para ord-003 (PROCESSING)
    ('ord-003', 'prod-301', 5, 9.99),
    
    -- Items para ord-004 (SHIPPED)
    ('ord-004', 'prod-401', 2, 199.99),
    ('ord-004', 'prod-402', 1, 299.99),
    
    -- Items para ord-005 (DELIVERED)
    ('ord-005', 'prod-501', 1, 599.99),
    
    -- Items para ord-006 (CANCELLED)
    ('ord-006', 'prod-601', 4, 24.99),
    
    -- Items para ord-007 (PENDING)
    ('ord-007', 'prod-701', 10, 4.99),
    ('ord-007', 'prod-702', 2, 79.99),
    
    -- Items para ord-008 (CONFIRMED)
    ('ord-008', 'prod-801', 1, 149.99),
    
    -- Items para ord-009 (DELIVERED)
    ('ord-009', 'prod-901', 3, 34.99),
    ('ord-009', 'prod-902', 2, 19.99),
    
    -- Items para ord-010 (PENDING)
    ('ord-010', 'prod-1001', 1, 399.99)
ON CONFLICT DO NOTHING;

-- Crear índice para búsquedas por estado (optimización común en APIs de filtrado)
CREATE INDEX IF NOT EXISTS idx_orders_status ON orders(status);

-- Crear índice para búsquedas por cliente (optimización para consultas de historial)
CREATE INDEX IF NOT EXISTS idx_orders_customer_id ON orders(customer_id);

-- Crear índice para búsquedas por fecha (optimización para consultas de rango)
CREATE INDEX IF NOT EXISTS idx_orders_created_at ON orders(created_at);

-- Crear índice para búsquedas de items por orden (optimización para cargar detalles)
CREATE INDEX IF NOT EXISTS idx_order_items_order_id ON order_items(order_id);