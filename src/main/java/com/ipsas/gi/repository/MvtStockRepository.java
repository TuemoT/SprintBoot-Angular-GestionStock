package com.ipsas.gi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipsas.gi.entities.MvtStock;
@Repository
public interface MvtStockRepository  extends JpaRepository<MvtStock, Long>{

}
