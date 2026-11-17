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