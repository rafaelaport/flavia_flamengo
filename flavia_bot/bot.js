var TwitterPackage = require('twitter');

var secret = {
  consumer_key: 'FAXuj3IQgSGbKE6zFS2pUYBDp',
  consumer_secret: 'yxi5RSDk0rKiZXt19MlR7UAuAQeP03FPPD73bxyNoez7ao3pTc',
  access_token_key: '1120488484425347072-EFjE4uRRfPjE8YBgh9Alzorn5iugZo',
  access_token_secret: 'gjjnv1nFigRPsv4YqEvfgc0s57EV3VaA4KiVJbcRtbmFp'
}
var Twitter = new TwitterPackage(secret);

// Call the stream function and pass in 'statuses/filter', our filter object, and our callback
Twitter.stream('statuses/filter', {track: '#flamengo'}, function(stream) {

  // ... when we get tweet data...
  stream.on('data', function(tweet) {

    // print out the text of the tweet that came in
    console.log(tweet.text);

    //build our reply object
    var statusObj = {status: "Oi @" + tweet.user.screen_name + ", vi que você usou a # do Flamengo e passei aqui para te avisar que hoje às 17h vai acontecer um jogo de futebol feminino, Flamengo X Grêmio. Para saber mais informações entre no www.flaviafla.com.br"}

    //call the post function to tweet something
    Twitter.post('statuses/update', statusObj,  function(error, tweetReply, response){

      //if we get an error print it out
      if(error){
        console.log(error);
      }

      //print the text of the tweet we sent out
      console.log(tweetReply.text);
    });
  });

  // ... when we get an error...
  stream.on('error', function(error) {
    //print out the error
    console.log(error);
  });
});