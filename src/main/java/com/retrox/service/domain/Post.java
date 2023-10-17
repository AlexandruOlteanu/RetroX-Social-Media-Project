package com.retrox.service.domain;

        import jakarta.persistence.*;
        import lombok.Data;

        import java.util.Date;

@Data
@Entity
@Table(name = "POST")


public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer postId;

    @Column(name = "CONTENT_URL")
    private String contentUrl;
    @Column(name = "DATE")
    private Date date;
    @Column(name = "DESCRIPTION")
    private String description;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "username")
    private User user;
}
