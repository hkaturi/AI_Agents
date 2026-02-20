def get_user(user_id):
    # Fetch user from database
    user = db.find(user_id)  # This can cause NullPointerException
    return user.name

def connect_database(host, port):
    # Connect to database
    connection = db.connect(host, port)  # This can timeout
    return connection

def process_order(order_id):
    order = db.get_order(order_id)
    total = order.calculate_total()  # Bug: can throw if order is None
    return total
