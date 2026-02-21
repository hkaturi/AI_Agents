User user = database.findUser(id);
if (user != null) {
    return user.getName();
} else {
    return null;
}