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