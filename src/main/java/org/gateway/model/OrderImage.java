package org.gateway.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class OrderImage {
    private Long id;
    private Order order;
    private byte[] pic;
}
