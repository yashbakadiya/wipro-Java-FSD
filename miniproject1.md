Route{

from: String
to:String
fare: double
distance: String
travelTuime: String
}


IRouteDao{
//store is 
fetchDataFromCsv()// fetches data from csv and fill in Route store

findAll(): Route[]

}


IRouteService{

 findDirectFlightsFromLocation(String from) throws NoRouteFoundException : Route[]

 findFlights(String from, String to): Route[]


}


FrontEnd{
..

}
