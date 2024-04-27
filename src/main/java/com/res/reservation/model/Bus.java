package com.res.reservation.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Bus")
@Table(name = "buses")
public class Bus {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bus_seq")
    @SequenceGenerator(name = "bus_seq", sequenceName = "bus_seq", allocationSize = 1)
    @Setter(AccessLevel.NONE)
    @Column(name = "id", nullable = false)
    private Long id;


    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "plate", nullable = false)
    private String plate;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "number_of_seats", nullable = false)
    private int numberOfSeats;

    @Column(name = "departure_city", nullable = false)
    private String departureCity;

    @Column(name = "arrival_city", nullable = false)
    private String arrivalCity;

    @Column(name = "departure_time", nullable = false)
    private LocalDateTime departureTime;

    @Column(name = "arrival_time", nullable = false)
    private LocalDateTime arrivalTime;

    @Column(name = "price", nullable = false)
    private double price;


    @OneToMany(mappedBy = "bus")
    private List<Seat> seats = new ArrayList<>();
}
