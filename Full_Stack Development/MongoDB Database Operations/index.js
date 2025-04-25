let express = require("express");
const { dbConnection } = require("./dbConnection");
const { ObjectId } = require("mongodb");
let app = express();

app.use(express.json());



app.get("/student-read", async (req, res) =>{
    let myDB = await dbConnection();
    let studentCollection = myDB.collection("Student");
    let data = await studentCollection.find().toArray();

    let objRes = {
        status: 1,
        msg: "Student List",
        data
    };

    res.send(objRes);
});



app.post("/student-insert", async (req, res) => {
    let myDB = await dbConnection();
    let studentCollection = myDB.collection("Student");

    // let obj = {
    //     sName:req.body.sName,
    //     sEmail:req.body.sEmail,
    // }

    let {sName, sEmail} = req.body;     //Another way to create an object for Name and Email
    let obj = {sName, sEmail};

    let checkEmail = await studentCollection.findOne({sEmail});

    if (checkEmail) {
        return res.send({
            status: 0,
            msg: "Email id already exists..."
        })
    }

    let insertRes =  await studentCollection.insertOne(obj);

    let objRes = {
        status: 1,
        msg: "Student data inserted successfully!",
        insertRes
    };

    res.send(objRes);
});



app.delete("/student-delete/:id", async (req, res) => {
    let myDB = await dbConnection();
    let studentCollection = myDB.collection("Student");

    let {id} = req.params;

    let delRes = await studentCollection.deleteOne({_id: new ObjectId(id)});

    let objRes = {
        status: 1,
        msg: "Student data deleted successfully!",
        delRes
    };

    res.send(objRes);

})



app.put("/student-update/:id", async (req, res) => {
    let myDB = await dbConnection();
    let studentCollection = myDB.collection("Student");

    let {id} = req.params;

    let {sName, sEmail} = req.body; 

    let obj = {};

    if (sName !== "" && sName !== null && sName !== undefined) {
        obj['sName'] = sName;
    }

    if (sEmail !== "" && sEmail !== null && sEmail !== undefined) {
        obj['sEmail'] = sEmail;
    }

    let updateRes = await studentCollection.updateOne({_id: new ObjectId(id)}, {$set: obj});

    let objRes = {
        status: 1,
        msg: "Student data updated successfully!",
        updateRes
    };

    res.send(objRes);
    
})


app.listen("8000");