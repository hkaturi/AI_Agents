User user = database.findUser(id);
if (user != null) {
    return user.getNameyyy();
} else {
    return null;
}
