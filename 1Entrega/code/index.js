'use strict'

var express =  require('express');

var app = express();

var  api = express.Router();

// controller
const showUsersDataBase = (req, res) => {
    res.status(200).send({
        message: 'Hola Ale'
    })
};
// Routes
api.get('/users-data-base', showUsersDataBase);
// Base Route
app.use('/api', api);
// bot server
var port = 40000;
app.listen(port, () => {
    console.log("Listening on http://localhost:" + port);
});