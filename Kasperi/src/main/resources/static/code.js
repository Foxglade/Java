

let list = document.querySelector("ul")

getCourses()

document.querySelector("button")
.addEventListener("click", e =>{
    e.preventDefault()

    let course = {
        Oppilas: document.getElementById("op").value,
        Kurssi: document.getElementById("ku").value
    }

    fetch("http://localhost:8080/addCourse",
    {
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        method: "POST",
        body: JSON.stringify(course)

    })
    .then(resp => getCourses())
    
})

function getCourses()
{

    list.innerHTML = ""
    fetch("http://localhost:8080/courses")
    .then(response => response.json())
    .then( Data =>
        {
            console.log(Data)
        Data.forEach(i =>{
            let li = document.createElement("li")
            li.innerText = "Nimi: "+ i.oppilas +" | "+" Kurssi: " + i.kurssi
            list.appendChild(li)
        })
    }) 

} 