package com.utdbankbackend.domain;

import com.utdbankbackend.domain.enumeration.UserRole;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(length = 30)
    private UserRole name;

    public Role(UserRole name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "" + name;
    }
}