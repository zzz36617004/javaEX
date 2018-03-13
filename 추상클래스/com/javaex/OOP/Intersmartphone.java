package com.javaex.OOP;



	interface MobilePhone{
		public boolean sendCall();
		public boolean recieveCall();
		public boolean sendSMS();
		public boolean receiveSMS();
	}
	interface MP3{
		public void play();
		public void stop();
	}
	class PDA{
		public int calculate(int x,int y) {
			return x+y;
		}
	}
	public class Intersmartphone extends PDA implements MobilePhone, MP3 {
		//mobilephone용 메소드
		public boolean sendCall() {
			System.out.println("전화걸기");
			return true;
		}
		public boolean recieveCall() {
			System.out.println("전화받기");
			return true;
		}
		public boolean sendSMS() {
			System.out.println("메세지 보내기");
			return true;
		}
		public boolean receiveSMS() {
			System.out.println("메세지 받기");
			return true;
		}
		//인터페이스 MP3용 메소드
		public void play() {
			System.out.println("음악재생");
		}
		public void stop() {
			System.out.println("음악끄기");
		}
		
		//추가 메소드 구현
		public void scheduler() {
			System.out.println("일정관리");
		}
		public void applicarionManager() {
			System.out.println("응용프로그램 설치/삭제");
		}

public static void main(String[] args) {
	Intersmartphone p =new Intersmartphone();
	p.sendCall();
	p.play();
	System.out.println(p.calculate(3, 5));
	p.scheduler();
}
}