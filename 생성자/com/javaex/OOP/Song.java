/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.45 (생성자)
 */
package com.javaex.OOP;

public class Song {
	private String title;
	private String artist;
	private String composer;
	private String album;
	private int year;
	private int track;
	public Song() {}
	
	public Song(String title, String artist,String composer,String album,int year,int track) {
		this();
		this.title=title;
		this.artist=artist;
		this.composer=composer;
		this.album=album;
		this.year=year;
		this.track=track;
	}
	
	public Song(String title, String artist) {
		this.title=title;
		this.artist=artist;
	}
	public String getAlbum() {
		return album;
	}
	public void setAlbum(String album) {
		this.album = album;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	}
	public String getComposer() {
		return composer;
	}
	public void setComposer(String composer) {
		this.composer = composer;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}
	public void showInfo() {
		System.out.println(getArtist()+","+getTitle()+"("+getAlbum()+","+getYear()+","+getTrack()+"번 track,"+getArtist()+"작곡)");
	}
}
