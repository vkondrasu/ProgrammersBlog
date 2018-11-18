function binarySearch(Arr, value_to_find, min, max){
    if( parseInt(min) <= parseInt(max) ){
        var index = parseInt( (parseInt(min) + parseInt(max) ) / 2 );

        if( parseInt(Arr[index]) === parseInt(value_to_find) ){
            return index;
        }
        else if( parseInt(Arr[index]) > parseInt(value_to_find) ){
            return binarySearch(Arr, value_to_find, min, index - 1);
        }
        else{
            return binarySearch(Arr, value_to_find, index+1, max );
        }
    }
    else return -1;
    
}
