import csv

import requests
from flask import Flask, render_template, request, jsonify

app = Flask(__name__)
app.config['SECRET_KEY'] = 'CA304'


def get_image():
    r = requests.get("https://meme-api.herokuapp.com/gimme")
    r = r.json()
    return r["url"]


@app.route('/')
def index():
    return render_template('index.html', image=get_image())


@app.route('/isloopgood')
def isloopgood():
    return render_template('isloopgood.html')


@app.route('/form.html', methods=['GET', 'POST'])
def sign_up():
    error = ""
    if request.method == 'POST':
        first_name = request.form['firstname']
        last_name = request.form['lastname']

        if len(first_name) == 0 or len(last_name) == 0:
            error = "Oops :( First name and Last name must be at least 1 character"
        else:
            print(first_name, last_name, "just submitted the form")
            return render_template('thank-you.html', name="{} {}".format(first_name, last_name))
    return render_template('form.html', message=error)


@app.route('/allegiances')
def allegiances():
    data = {}
    with open("allegiance.csv", encoding='utf-8') as csvf:
        csvReader = csv.DictReader(csvf)
        for rows in csvReader:
            key = rows["Name"]
            data[key] = rows
    resp = jsonify(data)
    return resp


@app.route('/allegiancedashboard')
def allegiancesdashboard():
    return render_template('allegiancedashboard.html')


# Run the application
app.run(debug=True)
