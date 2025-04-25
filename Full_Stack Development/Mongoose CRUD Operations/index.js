//npm i express
//npm i mongoose
//npm i dotenv

let express = require('express');
let mongoose = require('mongoose');

const { enquiryInsert, enquiryList, enquiryDelete, enquiryUpdate } = require('./Apps/Controllers/Web/userEnquiryController');
const { enquiryRoutes } = require('./Apps/Routes/Web/enquiryRoutes');

require('dotenv').config();


//Connect to MongoDB
let app = express();

app.use(express.json());

app.use("/web/api/enquiry", enquiryRoutes)

mongoose.connect(process.env.DBURL).then(() => {
    console.log("Connected to MongoDB...");
    app.listen(process.env.PORT, () => {
        console.log("Server is running on port " + process.env.PORT);
    });
});