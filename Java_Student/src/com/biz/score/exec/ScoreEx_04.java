package com.biz.score.exec;

import com.biz.score.service.ScoreService;
import com.biz.score.service.ServiceV1;

public class ScoreEx_04 
{
    public static void main(String[] args) 
    {
        ScoreService sService = new ServiceV1();

        sService.inputStudent();
        sService.inputScore();
        sService.calcSum();
        sService.calcAvg();
        sService.scoreList();

    }    
}