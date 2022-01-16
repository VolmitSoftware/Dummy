package com.volmit.dummybot;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.OnlineStatus;
import net.dv8tion.jda.api.entities.Activity;


public class Dummy {
    public static void main(String[] arguments) throws Exception
    {
        final JDA jda;
        jda = JDABuilder.createDefault("ODc1OTczMTYxODkwNTA4ODMw.YRdTlA.dSCPnRB8pbEA4M-d4sHNDHzCg1w")
                .addEventListeners(new MyListener())
                .build();
        jda.getPresence().setStatus(OnlineStatus.IDLE);
        jda.getPresence().setActivity(Activity.watching("The Universe: .?"));
    }
}


