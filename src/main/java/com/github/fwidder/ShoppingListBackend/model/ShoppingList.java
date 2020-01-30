package com.github.fwidder.ShoppingListBackend.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
@Builder
public class ShoppingList {
    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @OneToMany
    private List<ShoppingListItem> items;
}
