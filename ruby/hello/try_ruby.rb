class Hello
  def hello
    STDOUT.sync = true
    puts 'HELLO1'
  end
end

#wold = Hello.new
#world.hello

Hello.new.hello;