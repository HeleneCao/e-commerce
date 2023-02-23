package com.ecommerce.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Objects;

@Entity
public class Commande {

    @Id
    private Integer id;
    private Date dateCommande;
    private String etatCommande;
    private String commentaire;


    public Commande() {
    }

    public Commande(Integer id, Date dateCommande, String etatCommande, String commentaire) {
        this.id = id;
        this.dateCommande = dateCommande;
        this.etatCommande = etatCommande;
        this.commentaire = commentaire;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDateCommande() {
        return dateCommande;
    }

    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }

    public String getEtatCommande() {
        return etatCommande;
    }

    public void setEtatCommande(String etatCommande) {
        this.etatCommande = etatCommande;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Commande commande = (Commande) o;
        return Objects.equals(id, commande.id) && Objects.equals(dateCommande, commande.dateCommande) && Objects.equals(etatCommande, commande.etatCommande) && Objects.equals(commentaire, commande.commentaire);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dateCommande, etatCommande, commentaire);
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", dateCommande=" + dateCommande +
                ", etatCommande='" + etatCommande + '\'' +
                ", commentaire='" + commentaire + '\'' +
                '}';
    }
}
