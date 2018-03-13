/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.45 (생성자)
 */
package com.javaex.OOP;

public class SongApp {
	public static void main(String[] args) {
		Song IU=new Song();
		Song Lie=new Song();
		Song Spring=new Song();
		Song parkone=new Song("All of my life","박원","작곡가","앨범",2018,1);
		
		IU.setAlbum("Real");
		IU.setArtist("아이유");
		IU.setComposer("이민수");
		IU.setTitle("좋은날");
		IU.setYear(2010);
		IU.setTrack(3);
		
		Lie.setAlbum("Always");
		Lie.setArtist("BIGBANG");
		Lie.setComposer("G_DRAGON");
		Lie.setTitle("거짓말");
		Lie.setYear(2007);
		Lie.setTrack(2);

		Spring.setAlbum("버스커버스커1집");
		Spring.setArtist("버스커버스커");
		Spring.setComposer("장범준");
		Spring.setTitle("벚꽃엔딩");
		Spring.setYear(2012);
		Spring.setTrack(4);
		
		IU.showInfo();
		Lie.showInfo();
		Spring.showInfo();
		parkone.showInfo();
	}
}
