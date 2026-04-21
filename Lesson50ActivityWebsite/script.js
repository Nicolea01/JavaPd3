
let data,songs;
function init(){
  $.ajaxSetup({async: false});
  
for (let i = 0; i < dataArray.length; i++){ 
let song = dataArray[i]; 
 bld += ` 
<div class="song-card">
 <div class="card-section"> 
<p class="label">Song Name</p>
 <p class="data-text">${song.name}</p>
 </div> <div class="card-section"> 
<p class="label">Album</p> 
<p class="data-text">${song.albumTitle || 'Unknown Album'}</p> 
</div>
 <div class="card-section"> 
<p class="label">Composer</p>
 <p class="data-text">${song.composer || 'Various Artists'}</p> 
</div> 
</div>
 `; 
} 
outputDiv.innerHTML = bld; }

