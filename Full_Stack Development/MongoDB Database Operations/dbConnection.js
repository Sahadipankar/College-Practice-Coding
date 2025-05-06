const {MongoClient} = require ("mongodb");  // Importing MongoClient from mongodb package

let dbConnectionUrl = `mongodb://127.0.0.1:27017`;  // MongoDB connection URL

const client = new MongoClient(dbConnectionUrl);    // Creating a new MongoClient instance with the connection URL

let dbConnection = async() => { // Function to establish a connection to the database
    await client.connect();
    let db = client.db("mongoDB_Project_Database");
    return db;
}

module.exports = {dbConnection} // Exporting the dbConnection function to be used in other files