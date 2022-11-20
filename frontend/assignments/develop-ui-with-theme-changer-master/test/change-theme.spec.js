// const path = require('path');
// const { readFileSync } = require('fs');
// const { JSDOM } = require('jsdom');

const chai = require('chai');
const expect = chai.expect;
const changeTheme = require("../js/script");
const jsdom = require('mocha-jsdom');

describe("Change Theme", function () {
    jsdom({url: "http://localhost"});

    beforeEach(function () {
		document.body.innerHTML =
		`<input type="radio" name="theme" id="bright">`;
	});


    it("should be a function", function () {
        expect(typeof (changeTheme)).equal("function");
    });

    it("should change document theme to bright theme", () => {
        // document.body.innerHTML = `<input type="radio" name="theme" id="bright">`;
        const radio = document.getElementById('bright');
        radio.addEventListener('change',(event)=>{
            changeTheme(event);
        });
        radio.click();
        expect(document.body.style.backgroundColor).equal("lightyellow");
        expect(document.body.style.color).equal("darkgreen");
    });

    it("should change document theme to cool theme", () => {
        document.body.innerHTML = `
        <input type="radio" name="theme" id="cool">`;
        const radio = document.getElementById('cool');
        radio.addEventListener('change',(event)=>{
            changeTheme(event);
        });
        radio.click();
        expect(document.body.style.backgroundColor).equal("lightgray");
        expect(document.body.style.color).equal("indigo");
    });
});