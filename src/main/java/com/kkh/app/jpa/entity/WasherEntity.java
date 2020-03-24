package com.kkh.app.jpa.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(name = "washer")
@Data
public class WasherEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int washerId;

    // 사용 가능 여부
    boolean isAvailable;

    @ManyToOne
    @JoinColumn(name = "store_id")
    StoreEntity store;
}
