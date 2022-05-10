package com.springcore.springcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringCoreApplication {
    public static void main(String[] args) {

//           ########################    XML CODE CONFIGURATION    ############################
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//       Music music =  context.getBean("musicRockBean", Music.class);
//        System.out.println(music.getSong());
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();
//        System.out.println(musicPlayer.getName() + "           "+ musicPlayer.getVolume());
//        musicPlayer.playMusicList();
//        context.close();
//           ########################    XML CODE CONFIGURATION    ############################



        //           ########################    ANNOTATION CONFIGURATION    ############################
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
//        Music music =  context.getBean("repBean", Music.class);
//        NewMusicPlayer musicPlayer = new NewMusicPlayer(music);
//        NewMusicPlayer musicPlayer = context.getBean("newMusicPlayer", NewMusicPlayer.class);
//        musicPlayer.playMusic();
//        Computer computer = context.getBean("computer", Computer.class);
//        System.out.println(computer);
//        context.close();
        //           ########################    ANNOTATION CONFIGURATION    ############################

        //           ########################    ANNOTATION JAVA CONFIGURATION    ############################
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Configuration.class);
        Music music =  context.getBean("ruRepBean", Music.class);
        NewMusicPlayer musicPlayer = context.getBean("newMusicPlayer", NewMusicPlayer.class);
        System.out.println(musicPlayer.playMusic());




        //           ########################    ANNOTATION JAVA CONFIGURATION    ############################




    }

}
