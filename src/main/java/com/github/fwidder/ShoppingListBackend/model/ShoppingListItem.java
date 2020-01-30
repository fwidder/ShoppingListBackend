package com.github.fwidder.ShoppingListBackend.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class ShoppingListItem {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    @Column
    private String quantity;
}
