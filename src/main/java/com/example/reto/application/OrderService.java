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