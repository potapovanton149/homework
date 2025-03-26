package ru.courses.university;

public class ImplementationOfTheContract implements ContractForAssessments {
    public ImplementationOfTheContract(){
    }

    public boolean contractValidation(int value) {
        if (value > 0 && value <= 1000000 && value % 2 == 0) {
            return false;
        }
        return true;
    }
}
