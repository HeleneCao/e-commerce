package com.ecommerce.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.Objects;

@Entity
public class Stock{

        @Id
        private Integer id;
        private Integer quantité;

        public Stock() {
        }

        public Stock(Integer id, Integer quantité) {
                this.id = id;
                this.quantité = quantité;
        }

        public Integer getId() {
                return id;
        }

        public void setId(Integer id) {
                this.id = id;
        }

        public Integer getQuantité() {
                return quantité;
        }

        public void setQuantité(Integer quantité) {
                this.quantité = quantité;
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (!(o instanceof Stock stock)) return false;
                return Objects.equals(getId(), stock.getId()) && Objects.equals(getQuantité(), stock.getQuantité());
        }

        @Override
        public int hashCode() {
                return Objects.hash(getId(), getQuantité());
        }

        @Override
        public String toString() {
                return "Stock{" +
                        "id=" + id +
                        ", quantité=" + quantité +
                        '}';
        }
}


