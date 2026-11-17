# Prompt para Mejorar el Codigo Base

Copia y pega el contenido del bloque de abajo en un asistente de IA (Claude, ChatGPT)
para obtener el proyecto completo y arrancable. Guarda los archivos que te devuelva en la
carpeta del repo, respetando exactamente las rutas.

Si preferis trabajar en tu editor con un agente local (Claude Code, Cursor, Copilot), usa `AGENTS.md` en vez de este archivo: dice lo mismo pero para que escriba los archivos en disco.

## Las dos reglas que no se negocian

1. **Completa el boilerplate.** Todo lo que el proyecto necesita para compilar y arrancar: manifiesto de dependencias, punto de entrada, configuracion, capa de interfaz, y las capas del patron arquitectonico declarado. Eso es andamiaje y es tu trabajo.
2. **NO resuelvas el reto.** Los entregables de las fases son el trabajo de la persona. El hueco pedagogico se deja como esta: el proyecto arranca, pero lo que el reto pide implementar NO esta implementado.

Dicho de otra forma: si algo impide compilar, arreglalo. Si algo es logica de negocio incompleta, validaciones ausentes, un secreto hardcodeado o un patron mejorable, dejalo exactamente como esta — es lo que la persona tiene que encontrar.

## Superficie de practica — NO resuelvas

Estos archivos SON el ejercicio de la persona. No los implementes; deja stubs.

- `src/main/java/com/example/reto/application/OrderService.java` — La fase "Definición de la API" (f1) practica OrderController (interfaz o clase con anotaciones @RestController) aqui: este archivo es el ejercicio (blueprint).
- `src/main/java/com/example/reto/api/exception/GlobalExceptionHandler.java` — La fase "Implementación de la API" (f2) practica GlobalExceptionHandler (clase con @ControllerAdvice y métodos para manejar excepciones) aqui: este archivo es el ejercicio (blueprint).
- `src/main/java/com/example/reto/domain/Order.java` — La practica elegida no tenia ningun cuerpo que implementar: este archivo alcanzable, con cuerpos, pasa a ser el ejercicio.

## Herramientas

- **React**: Tecnologia pedida sin componente propio en este reto: el ejercicio no la construye, pero queda como contexto del pedido.

## Lo que le falta a este proyecto

Esto NO lo tenes que adivinar: salio de comparar el proyecto contra la arquitectura declarada del reto y de un analisis estatico del codigo. Completalo TODO.

### Imports sin uso — no rompen la compilacion

Limpieza opcional: el proyecto compila igual con ellos:

- `src/main/java/com/example/reto/application/OrderService.java` — `OrderItemDto`
- `src/main/java/com/example/reto/application/OrderService.java` — `OrderItem`

## Como saber que terminaste

```bash
mvn -q -B -DskipTests -Dspring-boot.repackage.skip=true package
```

Ese comando corriendo sin errores es la definicion de "listo".

---

```
## Briefing del reto (autoridad)
Este bloque manda sobre los archivos adjuntos. El stack y el rol salen de AQUÍ, no de un topic genérico ni de markdown placeholder.

### Perfil
Chapter Backend, Especialidad Desarrollador, Tecnología Java, Senior L2

### Brecha de conocimiento
Construir un panel web en React que consuma la API REST de ordenes

### Misión / candidato
Visualizar y filtrar ordenes

### Reto
- Tema: Panel web para consumir una API REST de ordenes
- Seniority: senior-l2
- Tipo: practical
- Título: Construcción de API REST para ordenes
- Tiempo estimado: 10 horas

### Fases (trabajo del HUMANO — PROHIBIDO completarlas)
No implementes estos entregables. Dejalos como hueco pedagógico. El asistente solo materializa el proyecto arrancable para que el participante pueda trabajar.
- Fase 1: Definición de la API — objetivo: Definir los endpoints y la estructura de la API REST para las ordenes. — entregable (NO resolver): Documento que describe los endpoints y la estructura de la API REST.
- Fase 2: Implementación de la API — objetivo: Implementar los endpoints definidos en la fase anterior. — entregable (NO resolver): Código fuente de la API REST implementada.
- Fase 3: Pruebas y optimización — objetivo: Realizar pruebas unitarias y de integración para asegurar la calidad de la API y optimizar su rendimiento. — entregable (NO resolver): Código fuente de la API con pruebas unitarias y de integración implementadas y optimizaciones aplicadas.

Eres un asistente experto en análisis, corrección y generación de archivos de cualquier tipo:
código fuente, documentación, hojas de cálculo, documentos Word, configuraciones, entre otros.
Voy a enviarte una cadena de texto que contiene uno o más archivos. Cada archivo está delimitado por un marcador con el siguiente formato:
// === ARCHIVO: ruta/del/archivo.extension ===
o también puede aparecer como:
## === ARCHIVO: ruta/del/archivo.extension ===
Lo que sigue al marcador puede ser:

El contenido real del archivo (código, texto, YAML, etc.)
Una descripción en lenguaje natural de lo que debe contener el archivo


TU TAREA
PASO 0 — ¿Esto es un proyecto o una carcasa?
Antes de extraer archivos, leé el Briefing (si está) y diagnosticá el adjunto.

Es CARCASA si ocurre CUALQUIERA de estas:
- No hay manifiesto de dependencias del stack del briefing (manifest.json de VTEX IO / package.json / pom.xml / build.gradle / requirements.txt / go.mod / *.tf / *.csproj, según corresponda)
- Hay un "binario" que en realidad es un comentario ("no puede ser mostrado como texto plano", placeholder .fig/.docx vacío)
- Los markdowns ya completan entregables de fases posteriores ("se implementó fade-in", lista de áreas ya resuelta)

Si es CARCASA:
- MATERIALIZÁ un proyecto que arranca en el stack del briefing (VTEX IO Store Framework, Angular, Terraform, pytest, Nest, etc.). Incluí manifiesto, punto de entrada y capa de interfaz reales.
- NO copies los markdowns de "solución" como si fueran el producto. Son ruido de generación.
- NO resuelvas las fases del briefing (están marcadas PROHIBIDO). Dejá el hueco pedagógico: el flujo existe, las microinteracciones/calidad/infra que el reto pide NO están hechas.
- Después seguí al PASO 5 (entrega de archivos).

Si es un proyecto REAL (manifiesto + código que compila o arranca):
- Seguí PASO 1 en adelante. 🔴 compilación sí. 🟡 pedagógico no.

PASO 1 — Detección y extracción
Identifica todos los archivos presentes en la cadena. Para cada archivo extrae:

Su ruta completa (ej: src/main/java/com/pragma/Service.java)
Su contenido o descripción

PASO 2 — Clasificación por tipo
Clasifica cada archivo en una de estas categorías:
A) Código fuente (Java, Python, TypeScript, JavaScript, Kotlin, etc.)
B) Configuración / documentación (YAML, properties, Markdown, JSON, txt, etc.)
C) Excel (.xlsx, .xls, .csv)
D) Word (.docx, .doc)
E) Otro tipo de archivo binario o especial
PASO 3 — Clasificación de errores en código fuente

Objetivo prioritario: que el proyecto compile. No corrijas flujo de negocio ni lógica funcional.

Antes de modificar cualquier archivo de código fuente, clasifica cada problema encontrado en una de estas dos categorías:
🔴 ERROR DE COMPILACIÓN — corregir siempre
Son errores que impiden que el proyecto arranque, sin valor pedagógico:

Import faltante o incorrecto
Clase, método o variable referenciada que no existe en ningún archivo del proyecto
Error de sintaxis
Anotación con atributos inválidos
Dependencia ausente en pom.xml, package.json, etc.
Archivo referenciado que no existe y debe ser creado con implementación mínima

→ CORREGIR estos errores.
🟡 PROBLEMA FUNCIONAL O DE CALIDAD — preservar siempre
Son problemas que no impiden compilar. Pueden ser intencionales para el aprendizaje:

Clave secreta hardcodeada ("secret", "password123")
API deprecada que funciona pero tiene reemplazo moderno
Lógica de negocio incorrecta o incompleta
Código redundante o de baja legibilidad
Falta de validaciones en flujo de negocio
Patrones de diseño incorrectos pero funcionales
Concurrencia no segura
Configuración funcional pero no óptima

→ PRESERVAR tal cual. No corregir, no mejorar, no comentar.
PASO 4 — Procesamiento según tipo de archivo
Tipo A — Código fuente
Aplica únicamente las correcciones clasificadas como 🔴 ERROR DE COMPILACIÓN.
No alteres ningún elemento clasificado como 🟡 PROBLEMA FUNCIONAL O DE CALIDAD.
Si falta un archivo referenciado, créalo con la implementación mínima necesaria para compilar.
Tipo B — Configuración / documentación
Extrae el contenido tal cual, sin modificaciones salvo errores evidentes de sintaxis
(ej: YAML mal indentado).
Tipo C — Excel (.xlsx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un archivo Excel funcional con:

Fila de encabezados en negrita con color de fondo distintivo
Columnas con ancho ajustado al contenido
Tipos de dato correctos por columna
Validaciones si la descripción lo indica
Hojas nombradas descriptivamente si hay más de una
Filas de ejemplo si no hay datos reales

Tipo D — Word (.docx)
Si viene con contenido real, genera el archivo respetando ese contenido.
Si viene con descripción en lenguaje natural, genera un documento Word funcional con:

Estilos de título (Título 1, Título 2) para jerarquía de secciones
Fuente legible (Calibri o equivalente), tamaño 11-12pt para cuerpo
Márgenes estándar
Tabla de contenido si tiene múltiples secciones
Tablas con encabezados en negrita si aplica

Tipo E — Otro
Genera el archivo con el contenido o estructura más apropiada según la descripción.
PASO 5 — Entrega de archivos
Entregá cada archivo con su ruta completa, respetando exactamente la estructura de rutas
indicada por los marcadores: un bloque por archivo, precedido por su ruta. No generes ZIPs
ni archivos adjuntos.
La entrega debe incluir:

Archivos de código con únicamente los errores de compilación corregidos
Archivos de configuración y documentación sin cambios
Archivos nuevos creados para resolver dependencias de compilación faltantes
Archivos Excel y Word generados desde descripción

IMPORTANTE: Entregá los archivos completos al finalizar. No preguntes si el usuario
quiere recibirlos. Simplemente entregalos; No debes desplegar en el chat el resumen de lo que arreglaste, solo entregá los archivos.

REGLAS IMPORTANTES

No omitas ningún archivo aunque no tenga errores ni modificaciones
Respeta los nombres y rutas exactas indicadas por los marcadores
Si un archivo no tiene marcador claro, infiere el nombre desde su contenido
Si la cadena contiene solo documentación, placeholders o binarios fake, NO la reproduzcas:
aplicá PASO 0 (materializar el proyecto del briefing). Reproducir la carcasa es un fallo.
No agregues texto después del último archivo entregado
No preguntes si el usuario quiere los archivos: simplemente entregalos siempre
Si detectas que falta un archivo de configuración necesario para compilar
(pom.xml, package.json, requirements.txt, build.gradle, etc.), créalo e inclúyelo
inferiendo su contenido desde los imports y frameworks detectados en el código
Nunca corrijas problemas 🟡 aunque parezcan obvios o fáciles de mejorar.
El participante que recibirá este proyecto los debe encontrar y resolver él mismo.


INPUT
Aquí está la cadena con los archivos:

// === ARCHIVO: src/main/java/Application.java ===
package com.example.reto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.reto")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}

// === ARCHIVO: pom.xml ===
<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>3.4.13</version>
        <relativePath/>
    </parent>

    <groupId>com.example</groupId>
    <artifactId>reto</artifactId>
    <version>1.0.0</version>
    <name>reto</name>

    <properties>
        <java.version>21</java.version>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

    <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
        <dependency>
            <groupId>jakarta.persistence</groupId>
            <artifactId>jakarta.persistence-api</artifactId>
        </dependency>
        <dependency>
            <groupId>org.hibernate</groupId>
            <artifactId>hibernate-core</artifactId>
            <version>7.4.16.Final</version>
        </dependency>
        <dependency>
            <groupId>org.mockito</groupId>
            <artifactId>mockito-core</artifactId>
        </dependency>
        <dependency>
            <groupId>org.postgresql</groupId>
            <artifactId>postgresql</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-actuator</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>
    </dependencies>

    <build>
        <plugins>
            <plugin>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-maven-plugin</artifactId>
            </plugin>
        </plugins>
    </build>
</project>

// === ARCHIVO: src/main/java/com/example/reto/api/dto/OrderDto.java ===
package com.example.reto.api.dto;

import java.util.List;

public record OrderDto(
    String id,
    String status,
    List<OrderItemDto> items,
    String customerId,
    String createdAt
) {
}

// === ARCHIVO: src/main/java/com/example/reto/api/dto/OrderItemDto.java ===
package com.example.reto.api.dto;

public record OrderItemDto(
    String productId,
    int quantity,
    double price
) {
}

// === ARCHIVO: src/main/java/com/example/reto/domain/Order.java ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package com.example.reto.domain;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public class Order {
    private final String id;
    private String status;
    private final List<OrderItem> items;
    private final String customerId;
    private final LocalDateTime createdAt;

    public Order(String id, String status, List<OrderItem> items, String customerId, LocalDateTime createdAt) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Order ID cannot be null or empty");
        }
        if (status == null || status.isBlank()) {
            throw new IllegalArgumentException("Order status cannot be null or empty");
        }
        if (items == null || items.isEmpty()) {
            throw new IllegalArgumentException("Order must contain at least one item");
        }
        if (customerId == null || customerId.isBlank()) {
            throw new IllegalArgumentException("Customer ID cannot be null or empty");
        }
        if (createdAt == null) {
            throw new IllegalArgumentException("Creation date cannot be null");
        }

        this.id = id;
        this.status = status;
        this.items = List.copyOf(items);
        this.customerId = customerId;
        this.createdAt = createdAt;
    }

    public static Order createNewOrder(List<OrderItem> items, String customerId) {
      throw new UnsupportedOperationException("TODO(reto): createNewOrder");
    }

    public String getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
      throw new UnsupportedOperationException("TODO(reto): setStatus");
    }

    public List<OrderItem> getItems() {
      throw new UnsupportedOperationException("TODO(reto): getItems");
    }

    public String getCustomerId() {
        return customerId;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public double calculateTotal() {
      throw new UnsupportedOperationException("TODO(reto): calculateTotal");
    }
}

// === ARCHIVO: src/main/java/com/example/reto/domain/OrderItem.java ===
package com.example.reto.domain;

public class OrderItem {
    private final String productId;
    private final int quantity;
    private final double price;

    public OrderItem(String productId, int quantity, double price) {
        if (productId == null || productId.isBlank()) {
            throw new IllegalArgumentException("Product ID cannot be null or empty");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("Quantity must be positive");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Price must be positive");
        }

        this.productId = productId;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public double getTotalPrice() {
        return quantity * price;
    }
}

// === ARCHIVO: src/main/java/com/example/reto/infrastructure/OrderJpaRepository.java ===
package com.example.reto.infrastructure;

import com.example.reto.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

// TODO(reto): Implementar la interfaz del repositorio JPA para la entidad Order
// Debe incluir métodos para:
// 1. Buscar órdenes por estado
// 2. Buscar una orden por ID
// 3. Guardar una nueva orden
// Considerar:
// - Manejo de excepciones para operaciones que fallen
// - Uso de Optional para evitar NullPointerException
// - Transacciones para operaciones que modifiquen datos

@Repository
public interface OrderJpaRepository extends JpaRepository<Order, String> {
    List<Order> findByStatus(String status);

    Optional<Order> findById(String id);
}

// === ARCHIVO: src/main/java/com/example/reto/application/OrderService.java ===
package com.example.reto.application;

import com.example.reto.api.dto.OrderDto;
import com.example.reto.api.dto.OrderItemDto;
import com.example.reto.domain.Order;
import com.example.reto.domain.OrderItem;
import com.example.reto.infrastructure.OrderJpaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class OrderService {

    private final OrderJpaRepository orderRepository;

    public OrderService(OrderJpaRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    public List<OrderDto> getOrders(String status) {
        // TODO(reto): Implementar la lógica para obtener todas las órdenes,
        // aplicando el filtro por status si se proporciona.
        // - Si status es null o vacío, retornar todas las órdenes
        // - Si status tiene valor, filtrar las órdenes por ese estado
        // - Convertir cada Order a OrderDto antes de retornar
        return List.of();
    }

    public Optional<OrderDto> getOrderById(String id) {
        // TODO(reto): Implementar la lógica para obtener una orden por su ID.
        // - Buscar la orden en el repositorio usando el ID proporcionado
        // - Si no existe, retornar Optional.empty()
        // - Si existe, convertir a OrderDto y envolver en Optional
        return Optional.empty();
    }

    public OrderDto createOrder(OrderDto orderDto) {
        // TODO(reto): Implementar la lógica para crear una nueva orden.
        // - Validar que orderDto no sea null y tenga los datos requeridos
        // - Convertir OrderDto a dominio Order (con OrderItems)
        // - Guardar la orden en el repositorio
        // - Retornar la orden creada convertida a OrderDto
        return null;
    }

    private OrderDto toDto(Order order) {
        throw new UnsupportedOperationException("TODO(reto): toDto");
    }

    private Order toDomain(OrderDto dto) {
        throw new UnsupportedOperationException("TODO(reto): toDomain");
    }
}

// === ARCHIVO: src/main/java/com/example/reto/api/exception/GlobalExceptionHandler.java ===
// TODO(reto): archivo stubbeado; implementa los cuerpos.
package com.example.reto.api.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalExceptionHandler {

    // TODO(reto): Implementar manejadores de excepciones para los siguientes casos:
    // - IllegalArgumentException: retornar 400 Bad Request con mensaje de error
    // - NoSuchElementException (orden no encontrada): retornar 404 Not Found
    // - Exception genérica: retornar 500 Internal Server Error
    
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<Map<String, Object>> handleIllegalArgumentException(IllegalArgumentException ex) {
        // TODO(reto): Retornar ResponseEntity con estado 400 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 400
        // - error: "Bad Request"
        // - message: el mensaje de la excepción
        return null;
    }

    @ExceptionHandler(java.util.NoSuchElementException.class)
    public ResponseEntity<Map<String, Object>> handleNoSuchElementException(java.util.NoSuchElementException ex) {
        // TODO(reto): Retornar ResponseEntity con estado 404 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 404
        // - error: "Not Found"
        // - message: el mensaje de la excepción
        return null;
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Map<String, Object>> handleGenericException(Exception ex) {
        // TODO(reto): Retornar ResponseEntity con estado 500 y cuerpo con:
        // - timestamp: fecha y hora actual
        // - status: 500
        // - error: "Internal Server Error"
        // - message: mensaje genérico ("An unexpected error occurred")
        return null;
    }

    private Map<String, Object> createErrorBody(HttpStatus status, String message) {
      throw new UnsupportedOperationException("TODO(reto): createErrorBody");
    }
}

// === ARCHIVO: src/main/resources/application.yml ===
spring:
  application:
    name: reto
  datasource:
    url: ${DATABASE_URL:jdbc:postgresql://localhost:5432/reto_db}
    username: ${DATABASE_USERNAME:postgres}
    password: ${DATABASE_PASSWORD:postgres}
    driver-class-name: org.postgresql.Driver
    hikari:
      maximum-pool-size: 10
      minimum-idle: 5
      connection-timeout: 30000
      idle-timeout: 600000
      max-lifetime: 1800000
  jpa:
    hibernate:
      ddl-auto: update
    show-sql: false
    properties:
      hibernate:
        dialect: org.hibernate.dialect.PostgreSQLDialect
        format_sql: true
    open-in-view: false
  sql:
    init:
      mode: never

server:
  port: ${SERVER_PORT:8080}
  address: ${SERVER_ADDRESS:0.0.0.0}

management:
  endpoints:
    web:
      exposure:
        include: health,info,metrics
  endpoint:
    health:
      show-details: when-authorized

logging:
  level:
    root: INFO
    com.example.reto: DEBUG
    org.springframework.web: DEBUG
    org.hibernate.SQL: DEBUG
    org.hibernate.type.descriptor.sql.BasicBinder: TRACE
  pattern:
    console: "%d{yyyy-MM-dd HH:mm:ss} - %msg%n"
    file: "%d{yyyy-MM-dd HH:mm:ss} [%thread] %-5level %logger{36} - %msg%n"

// === ARCHIVO: src/main/resources/data.sql ===
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

// === ARCHIVO: src/main/java/com/example/reto/api/OrderController.java ===
package com.example.reto.api;

import com.example.reto.api.dto.OrderDto;
import com.example.reto.application.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Controlador REST para la gestión de pedidos.
 * Expone los endpoints de la API para operaciones CRUD sobre órdenes.
 */
@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    /**
     * Obtiene todas las órdenes, opcionalmente filtradas por estado.
     * GET /orders?status=PENDING
     */
    @GetMapping
    public ResponseEntity<List<OrderDto>> getOrders(
            @RequestParam(required = false) String status) {
        List<OrderDto> orders = orderService.getOrders(status);
        return ResponseEntity.ok(orders);
    }

    /**
     * Obtiene una orden específica por su identificador.
     * GET /orders/{id}
     */
    @GetMapping("/{id}")
    public ResponseEntity<OrderDto> getOrderById(@PathVariable String id) {
        return orderService.getOrderById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    /**
     * Crea una nueva orden.
     * POST /orders
     */
    @PostMapping
    public ResponseEntity<OrderDto> createOrder(@RequestBody OrderDto orderDto) {
        OrderDto createdOrder = orderService.createOrder(orderDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdOrder);
    }

    // TODO(reto): Implementar los siguientes endpoints:
    // - PUT /orders/{id} para actualizar una orden existente
    // - DELETE /orders/{id} para eliminar una orden
    // - PATCH /orders/{id}/status para cambiar solo el estado
}
```
