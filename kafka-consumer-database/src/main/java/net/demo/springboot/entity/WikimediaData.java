package net.demo.springboot.entity;

import jakarta.persistence.*;

@Entity
@Table(name="wikimedia_recentchange")
public class WikimediaData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 100000)
    @Lob
    private String wikiEventData;

    public Long getId() {
        return id;
    }

    public String getWikiEventData() {
        return wikiEventData;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setWikiEventData(String wikiEventData) {
        this.wikiEventData = wikiEventData;
    }

}
