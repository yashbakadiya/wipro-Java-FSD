
## Spring Boot DI Layered Architection task, Use HahMap as store


Stock{

 id: long
 
 name: String
 units: int

}


IStockDao{

save(stock:Stock ) : Stock

findById(long id): Stock



}


IStockService{

register(String name, int units): Stock

findStockById(long stockId) throws StockNotFoundException : Stock

changeName(long stockId, String newName) throws StockNotFoundException : Stock


}

FrontEnd{

Use service and add 2 stocks

find stock by id and display details

change stock name and display details

}

Validations

id can't be zero or negative

name can't be smaller than 2 letters and max 10 letters

units can't be smaller than zero




