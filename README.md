# How to use IfShare RMI

## Recommandations
- Use Java 11 version
- Run Server and Clients from terminal

## Build Project RMI

### Linux
Place yourself in `eiffelcorp/` repository.  
Run script `build_project.sh` with command :  
```sh
./build_project.sh
```

### Windows
Place yourself in `eiffelcorp/` repository.  
Double clic on `build_project.bat` script.

## Run Server

### Linux
Place yourself in `eiffelcorp/` repository.  
Run script `run_server.sh` with command :  
```sh
./run_server.sh
```

### Windows
Place yourself in `eiffelcorp/` repository.  
Double clic on `run_server.bat` script.

## Run client

### Linux
Place yourself in `eiffelcorp/` repository.  
Run script `run_client.sh` with command :  
```sh
./run_client.sh
```

### Windows
Place yourself in `eiffelcorp/` repository.  
Double clic on `run_client.bat` script.

## How to interact with server
As a client, you have a lot of commands to interact with the server or commands to have informations about you.  

### Available Products
You can ask available products with this command : `@all`.  
Server will respond with a list of products, or a string saying there is no product.  
Product are displayed like this : `[name of product] [price] [state note] [number in stock] [list of ids for this product]`.

### Available Products by Type
You can search products by type with this command : `@type [type of product]`.
Server will answer with a list of products of this `type`, or a string saying there is no product.  

### Sell Products
You can sell products with this command : `@sell [name of product] [price of product] [state note] [global note]`.
Server will register the product in available Products.

### Buy Products by ID
You can buy products with this command : `@buy [id of product]`.
Server will inform you that you bought the product, or if it was not available.  
If there is no available product, you're not subscribed to the waitlist.  

### Buy Products by type
You can buy products with this command : `@buytype [type] [of] [product]`.
Server will inform you that you bought the product, or if it was not available.  
If there is many product of this type, the cheaper will be purchased.
If there is no available products, you are subscribed to a waitlist.  

### Get note of a product
You can ask the note of a product with this command : `@note [type] [of] [product]`.
Server will respond with the note of the current product.  

## Request without the server

### Informations about client (you)
You can ask information about your situation with this command : `@info`.  
This command displays your bank and the list of products you are selling.

### Help
You can display all commands with this command : `@help`.

