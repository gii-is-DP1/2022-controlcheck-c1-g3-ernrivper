package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "RECOVERYROOM")
public class RecoveryRoom extends BaseEntity{
    @Column(unique = true)
    Integer id;

    @NotNull
    @Length(min = 3, max = 50) 
    @Column(name = "name")
    String name;

    @NotNull
    @PositiveOrZero
    @Column(name = "size")
    double size;

    @NotNull
    @Column(name = "secure")
    boolean secure;

    @ManyToOne(optional = false)
    @JoinColumn(name = "RECOVERYROOMTYPE")
    RecoveryRoomType roomType;
}
