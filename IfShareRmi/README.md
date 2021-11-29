# How to use IfShare RMI

## Recommandations

- Use Java 11 version
- Run Server and Clients from terminal

## Run Server
Place you in `IfShareRmi/bin` repository.
Run command
```sh
java fr.uge.ifshare.server.IfShareServer
```

## Run client
Place you in `IfShareRmi/bin` repository.
Run command
```sh
java fr.uge.ifshare.server.IfShareServerClient
```

## How to interact with server
As a client, you have a lot of commands to interact with the server.  
You can `ask` how much products are available, search products by `type` or `sell` and `buy` products.

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
