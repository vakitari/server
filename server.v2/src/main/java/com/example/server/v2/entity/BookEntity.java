package com.example.server.v2.entity;

        import com.example.server.v2.entity.BookEntity;
        import com.fasterxml.jackson.annotation.JsonIgnore;
        import lombok.Data;

        import javax.persistence.*;
        import javax.validation.constraints.NotBlank;
        import javax.validation.constraints.NotNull;
        import java.util.List;


@Entity
@Data
@Table(name = "books")
public class BookEntity {
    @Column(name = "books_id")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String title;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
    @NotNull
    @ManyToOne
    @JoinColumn(name = "publisher_id")
   private PublisherEntity publishing;
    private int year;
    private String king;

}
