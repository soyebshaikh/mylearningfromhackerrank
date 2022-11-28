/* 

take an example 73%5=3 which is 3>2
hence 73+5-3=75
*/




for (int i = 0; i < grades.size(); i++){
    if (grades.get(i) > 37 && grades.get(i) % 5 > 2){
        grades.set(i, (grades.get(i) + ( 5 - (grades.get(i) % 5))));
    }   
}
return grades;
