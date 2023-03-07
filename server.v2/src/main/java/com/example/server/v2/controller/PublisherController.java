package com.example.server.v2.controller;

        import com.example.server.v2.entity.BookEntity;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import lombok.Data;

        import javax.persistence.*;
        import javax.validation.constraints.NotBlank;
        import java.util.List;


@Entity
@Data
@Table(name = "authors")
public class PublisherController {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String publisher;
    private String sity;
    @JsonIgnore
    @OneToMany(cascade =CascadeType.ALL, mappedBy = "publisher")
    private List<BookEntity> book;

}
