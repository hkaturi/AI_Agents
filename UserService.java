List<User> userList = new ArrayList<>();
if(userList.stream().anyMatch(user -> user.getId().equals(userId))) {