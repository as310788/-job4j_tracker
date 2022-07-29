package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {

    public static double averageScore(List<Pupil> pupils) {
        if (pupils.size() == 0) {
            return -1;
        }
        double score = 0;
        int count = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                score += subject.getScore();
                count++;
            }
        }
        return score / count;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> labelSub = new ArrayList<>();
        if (pupils.size() == 0) {
            return labelSub;
        }
        Map<String, Integer> map = new LinkedHashMap<>();
        double count = 0;
        double avgScore;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                map.merge(subject.getName(), subject.getScore(), Integer::sum);
            }
            count++;
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            avgScore = entry.getValue() / count;
            labelSub.add(new Label(entry.getKey(), avgScore));
        }
        return labelSub;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> labelPupil = new ArrayList<>();
        if (pupils.size() == 0) {
            return labelPupil;
        }
        for (Pupil pupil : pupils) {
            double scoreSum = 0;
            int count = 0;
            double avgScore;
            for (Subject subject : pupil.getSubjects()) {
                scoreSum += subject.getScore();
                count++;
            }
            avgScore = scoreSum / count;
            labelPupil.add(new Label(pupil.getName(), avgScore));
        }
        return labelPupil;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        if (pupils.size() == 0) {
            return new Label("Empty list", -1);
        }
        List<Label> labelPupil = new ArrayList<>();
        for (Pupil pupil : pupils) {
            double scoreSum = 0;
            for (Subject subject : pupil.getSubjects()) {
                scoreSum += subject.getScore();
            }
            labelPupil.add(new Label(pupil.getName(), scoreSum));
        }
        labelPupil.sort(Comparator.reverseOrder());
        return labelPupil.get(0);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        if (pupils.size() == 0) {
            return new Label("Empty list", -1);
        }
        List<Label> labelSubject = new ArrayList<>();
        Map<String, Integer> map = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.getSubjects()) {
                map.merge(subject.getName(), subject.getScore(), Integer::sum);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            labelSubject.add(new Label(entry.getKey(), entry.getValue()));
        }
        labelSubject.sort(Comparator.reverseOrder());
        return labelSubject.get(0);
    }
}