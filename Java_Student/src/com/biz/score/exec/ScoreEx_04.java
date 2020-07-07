package com.biz.score.exec;

import com.biz.score.service.ScoreService;
<<<<<<< HEAD
import com.biz.score.service.ScoreServiceImplV1;
=======
import com.biz.score.service.ServiceV1;
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

public class ScoreEx_04 
{
    public static void main(String[] args) 
    {
<<<<<<< HEAD
        ScoreService sService = new ScoreServiceImplV1();
=======
        ScoreService sService = new ServiceV1();
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

        sService.inputStudent();
        sService.inputScore();
        sService.calcSum();
        sService.calcAvg();
<<<<<<< HEAD
        sService.scoreList("00010");
=======
        sService.scoreList();
>>>>>>> e369461c8344791c95605052a62dad97ff150b09

    }    
}