package com.example.songsapi.model;

import javax.persistence.*;


    @Entity
    @Table(name = "songs")
    public class Song {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long id;
        @Column
        private String title;
        @Column(name = "duration")
        private int length;
        @Column
        private String content;

        public Song() {}

        public Song(long id, String title, int length, String content) {
            this.id = id;
            this.title = title;
            this.length = length;
            this.content = content;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String toString() {
            StringBuilder s = new StringBuilder();
            s.append("Song{")
                    .append("id:").append(id)
                    .append(",title:").append(title)
                    .append(",length:").append(length)
                    .append(",content:").append(content)
                    .append("}");
            return s.toString();
        }
}
