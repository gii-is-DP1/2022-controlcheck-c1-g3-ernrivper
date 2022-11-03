package org.springframework.samples.petclinic.recoveryroom;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;
import org.springframework.samples.petclinic.model.BaseEntity;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name = "RECOVERYROOMTYPE")
public class RecoveryRoomType extends BaseEntity{
    @Column(unique = true, nullable = false)
    private Integer id;

    @NotNull
    @Length(min = 5, max = 50)
    @Column(name = "name")
    String name;
}
