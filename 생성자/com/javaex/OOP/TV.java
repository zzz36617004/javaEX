/*
작성자:배진현
작성일:2018.03.08
설   명:ppt.47 (연습문제)
 */
package com.javaex.OOP;

public class TV {
	private int channel;
	private int volume;
	private boolean power;

	public TV(int channel, int volume, boolean power) {
		this.volume = volume;
		this.channel = channel;
		this.power = power;
	};

	public void volume(int volume) {
		this.volume = volume;
	}

	public void channel(int channel) {
		this.channel = channel;
	}

	public void channel(boolean up) {
		if (up == true) {
			channel++;
		} else {
			channel--;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			volume++;
		} else {
			volume--;
		}
	}

	public void getChannel(int channel) {
		this.channel = channel;
	}

	public void getvolume(int volume) {
		this.volume = volume;
	}

	public void power(boolean power) {
		this.power = power;
	}

	public void status() {
		System.out.println("채널:" + channel + " 볼륨:" + volume + " 전원:" + power);
	}
}
