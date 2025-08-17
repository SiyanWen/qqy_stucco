CREATE KEYSPACE IF NOT EXISTS shop_ks
    WITH replication = {'class': 'SimpleStrategy', 'replication_factor': 1};
USE shop_ks;

CREATE TABLE IF NOT EXISTS orders_by_id (
                                            order_id uuid PRIMARY KEY,
                                            user_id uuid,
                                            created_at timestamp,
                                            status text,
                                            currency text,
                                            items list<frozen<tuple<text,int,decimal>>>,
                                            subtotal decimal, tax decimal, shipping_fee decimal, total decimal
);

CREATE TABLE IF NOT EXISTS orders_by_user (
                                              user_id uuid,
                                              created_at timestamp,
                                              order_id uuid,
                                              status text,
                                              total decimal,
                                              currency text,
                                              PRIMARY KEY ((user_id), created_at, order_id)
) WITH CLUSTERING ORDER BY (created_at DESC, order_id ASC);
