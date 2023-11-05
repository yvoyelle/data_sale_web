package data_sale_web.data_sale_web;

import java.io.Serializable;

import javax.persistence.*;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Entity

public class form implements  Serializable {
private static final long serialVersionUID=1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY);
private Long id;
    private String name;
    private String email;
    private String phone;
    private String message;
}
