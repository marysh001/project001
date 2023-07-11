class Gender extends Human{
    
private Gender gender{
    Human gender = getGender();
    if (gender != gender.Female){
        res += gender.Male;
    } else {
        res += "ошибка";
    }
    return res;
}
}