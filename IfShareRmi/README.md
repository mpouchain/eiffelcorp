# How to use IfShare RMI

## Recommandations
- Use Java 11 version
- Run Server and Clients from terminal

## Build Project RMI
Place you in `eiffelcorp/` repository.
Run script `build_project.sh` with command :  
```sh
./build_project.sh
```

## Run Server
Place you in `eiffelcorp/` repository.
Run script `run_server.sh` with command :  
```sh
./run_server.sh
```

## Run client
Place you in `eiffelcorp/` repository.
Run script `run_client.sh` with command :  
```sh
./run_client.sh
```

## How to interact with server
As a client, you have a lot of commands to interact with the server or commands to have informations about you.  

### Available Products
You can ask available products with this command : `@all`.  
Server will respond you with a list of product, or a sentence to say there is no products.  
Product are display like this : `[name of product] [price] [number in stock] [list of ids for this product]`.

### Available Products by Type
You can search products by type with this command : `@type [type] [of] [product]`.
Server will respond you with a list of product of this `type`, or a sentence to say there is no products.  

### Sell Products
You can sell products with this command : `@sell [name] [of] [product] [price of product]`.
Server will register the product in available Products.

### Buy Products
You can buy products with this command : `@buy [id of product]`.
Server will inform you than you have buy the product, or if he were not available.
