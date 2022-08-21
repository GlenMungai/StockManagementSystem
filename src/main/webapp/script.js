function message(){
    var Name = document.getElementById('productName');
    var category = document.getElementById('productCategory');
    var price = document.getElementById('productPrice');
    const success = document.getElementById('success');
    const danger = document.getElementById('danger');

    if(Name.value === '' || category.value === '' || price.value === ''){
        danger.style.display = 'block';
    }
    else{
        setTimeout(() => {
            Name.value = '';
            category.value = '';
            price.value = '';
        }, 2000);

        success.style.display = 'block';
    }


    setTimeout(() => {
        danger.style.display = 'none';
        success.style.display = 'none';
    }, 4000);

}